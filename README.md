# A simple library for credit card number and expired data mask
[![](https://jitpack.io/v/behruzbahromzoda97/CreditCardMask.svg)](https://jitpack.io/#behruzbahromzoda97/CreditCardMask)

In mobile wallets offen developers need to format credit card number and expired data with jetpack compose we can easyly implement it 

Setup
-----
To try out this sample app, you need to at least use the latest version
of Android Studio. This project has been tested against Android Studio Artic Fox.
[You can download it here](https://developer.android.com/studio/preview).
In general, Jetpack Compose requires you to use the Canary version of
Android Studio.

Examples
-----------------

Each example is meant to be self contained and tries to explain all the
concepts that its using with comments. Compose also comes with this
nifty feature that lets you preview each component in the IntelliJ IDE
itself. To do so, go to any of the examples and then click on
the preview button in the top right corner. This is possible if your
`@Composable` component has a corresponding `@Preview` method associated
with it. Look at the examples below for all this to make a bit more
sense.

![Jetpack Compose Preview Functionality](screenshots/compose_preview.gif)

### General

|Example|Preview|
|-------|-------|
|[Credit card number formatting in compose ]()|<img src ="screenshots/cardnumber.gif" width=214 height=400> |
|[How do I make a view clickable and do actions when clicked?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/material/AlertDialogActivity.kt#L51)| <img src ="screenshots/alert_dialog.gif" width=214 height=400> |
|[How do I add padding around a view?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/layout/LayoutModifierActivity.kt#L51) <br/>  [How do I add an offset to a layout?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/layout/LayoutModifierActivity.kt#L90) <br/> [How do I enforce a layout to have a fixed aspect ratio?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/layout/LayoutModifierActivity.kt#L112)|<img src ="screenshots/layout_modifiers.png" width=214 height=400>|
|How do I add a background color to any section of the screen? <br/> [Example 1](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/text/CustomTextActivity.kt#L187) <br/> [Example 2](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/material/DrawerAppActivity.kt#L123)|<img src ="screenshots/background_surface1.png" width=214> <br/> <img src ="screenshots/background_surface2.png" width=214> |
|[How do I get FrameLayout like functionality to stack views on top of one another?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/stack/StackActivity.kt)| |
|How do I do animation in Jetpack Compose? <br/>[Example: Rotation Animation](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/animation/Animation1Activity.kt) <br/> [Example: Color Change Animation](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/animation/Animation2Activity.kt) |<img src ="screenshots/animation_rotation.gif" width=214 height=400> <br/> <br/> <img src ="screenshots/color_animation.gif" width=214 height=400>|
|[How do styles & themes work in Jetpack Compose?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/theme/DarkModeActivity.kt) <br/> [How do I add dark mode capability to my app?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/theme/DarkModeActivity.kt)|<img src ="screenshots/dark_mode.gif" width=214 height=400> |


License
-----------------

    Copyright 2022 Vinay Gaba

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

  
