# Android Image Viewer

## Overview
The Android Image Viewer is an application designed to display images stored on an Android device. Upon launching the app, users can view thumbnails of all images available on their device. When an image is selected, it opens in full-screen mode for a better viewing experience. The app also allows users to choose a specific folder to filter and display images only from that selected directory.

## Features
- Display all images in a grid view as thumbnails.
- Open selected images in full-screen mode.
- Option to select a specific folder to view images from.

## Getting Started

### Prerequisites
- Android Studio installed on your machine.
- An Android device or emulator for testing.

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/android-image-viewer.git
   ```
2. Open the project in Android Studio.
3. Ensure that the necessary permissions are set in the `AndroidManifest.xml` for reading external storage.

### Running the Application
1. Connect your Android device or start an emulator.
2. Run the application from Android Studio.
3. Upon launching, you will see a grid of image thumbnails.
4. Tap on any thumbnail to view the image in full-screen mode.
5. Use the folder selection feature to filter images by directory.

## File Structure
```
android-image-viewer
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── imageviewer
│   │   │   │               ├── MainActivity.kt
│   │   │   │               ├── FullscreenImageActivity.kt
│   │   │   │               └── utils
│   │   │   │                   └── FileUtils.kt
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── activity_fullscreen_image.xml
│   │   │   │   ├── drawable
│   │   │   │   └── values
│   │   │   │       ├── strings.xml
│   │   │   │       └── styles.xml
│   │   │   └── AndroidManifest.xml
├── build.gradle
├── settings.gradle
└── README.md
```

## Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request with your changes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.