package com.example.imageviewer.utils

import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import java.io.File

object FileUtils {

    fun getImagesFromGallery(context: Context, directory: String? = null): List<Uri> {
        val imageUris = mutableListOf<Uri>()
        val projection = arrayOf(MediaStore.Images.Media._ID)
        val selection = if (directory != null) {
            "${MediaStore.Images.Media.DATA} LIKE ?"
        } else {
            null
        }
        val selectionArgs = if (directory != null) {
            arrayOf("$directory/%")
        } else {
            null
        }

        val cursor = context.contentResolver.query(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            projection,
            selection,
            selectionArgs,
            null
        )

        cursor?.use {
            val idColumn = it.getColumnIndexOrThrow(MediaStore.Images.Media._ID)
            while (it.moveToNext()) {
                val id = it.getLong(idColumn)
                val contentUri = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id.toString())
                imageUris.add(contentUri)
            }
        }

        return imageUris
    }

    fun getDirectoryImages(context: Context, directoryPath: String): List<Uri> {
        val directory = File(directoryPath)
        return if (directory.exists() && directory.isDirectory) {
            directory.listFiles { file -> file.isFile && file.extension in listOf("jpg", "jpeg", "png") }
                ?.map { Uri.fromFile(it) } ?: emptyList()
        } else {
            emptyList()
        }
    }
}