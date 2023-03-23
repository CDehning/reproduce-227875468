# Reproducing https://issuetracker.google.com/issues/227875468

Run this app on an Android emulator with following standard image:
* Release Name: Nougat
* API Level: 25
* ABI: arm64-v8a
* Target: Android 7.1.1

The code (check [MainActivity](app/src/main/java/com/example/myapplication/MainActivity.kt)) is shipped with the fonts presented in the ticket, as well as additional fonts from Google Fonts - some crashing (e.g. Roboto Flex Variable) and some not crashing (e.g. Open Sans).
