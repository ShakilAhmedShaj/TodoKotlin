<h2 style="margin-bottom: 0;" align="center">To Do - Kotlin</h2>

<p align="center">
<img src="https://user-images.githubusercontent.com/15268903/91800532-f0ce2c00-ec4a-11ea-946b-bfe8005ac3f1.png" height="100" width="100">
<h3 style="margin-top: 0;" align="center">Basic ToDo app using Kotlin & Best Practices</h3>

</p>
	
## App Screenshots
<table>
  <tr>
     <td align="center">Todos & Sorting</td>
     <td align="center">Add</td>
     <td align="center">Update</td>
  </tr>
  <tr>
    <td valign="top"><img src="https://user-images.githubusercontent.com/15268903/91808401-540d8d80-ec4e-11ea-802c-9942645be73a.gif" height="400" width="200"></td>
    <td valign="top"><img src="https://user-images.githubusercontent.com/15268903/91810398-a13e2f00-ec4f-11ea-82ce-2b0b3c4dd80a.gif" height="400" width="200"></td>
    <td valign="top"><img src="https://user-images.githubusercontent.com/15268903/91811657-b025e100-ec51-11ea-8677-1086057508a7.gif" height="400" width="200"></td>
   
   
  </tr>
 </table>
 <br>
 <table>
  <tr>
     <td align="center">Search</td>
     <td align="center">Delete</td>
     <td align="center">Swipe Delete & Undo</td>
  </tr>
  <tr>
    <td valign="top"><img src="https://user-images.githubusercontent.com/15268903/91811770-d8addb00-ec51-11ea-8a81-1b9b8fdcab9b.gif" height="400" width="200"></td>
    <td valign="top"><img src="https://user-images.githubusercontent.com/15268903/91812956-bb7a0c00-ec53-11ea-8c59-453683c5467f.gif" height="400" width="200"></td>
    <td valign="top"><img src="https://user-images.githubusercontent.com/15268903/91812961-bd43cf80-ec53-11ea-9213-7d9030c2887e.gif" height="400" width="200"></td>
  </tr>
 </table>

## Features

* Add/Update/Delete Todos
* Search
* Sorting
* Swipe to delete
* Undo - restore deleted todo

### Built With

* Android Studio 4.0.1 The latest version can be downloaded from [here](https://developer.android.com/studio/)
* Build gradle 4.0.1
* Android SDK 30
* Kotlin Version 1.4.0

## Libraries Used
* [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started)
* [Room](https://developer.android.com/topic/libraries/architecture/room)
* [RecyclerView Animator](https://github.com/wasabeef/recyclerview-animators)

### Install the apk

<a href="https://shakilahmedshaj.com//apks/ToDoKotlin.apk"><img alt="Get it on Google Play" src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" width="185" height="70"/></a>

Go to the following [link](https://shakilahmedshaj.com//apks/ToDoKotlin.apk) to download the app.

### Directory Structure

The following is a high level overview of relevant files and folders.

```
TodoKotlin
└───app
    └───src
        └───main
            └───java
                └───com
                    └───decimalab
                        └───todokotlin
                            │   MainActivity.kt
                            │
                            ├───data
                            │   │   Converter.kt
                            │   │   TodoDao.kt
                            │   │   ToDoDatabase.kt
                            │   │
                            │   ├───models
                            │   │       Priority.kt
                            │   │       TodoData.kt
                            │   │
                            │   ├───repository
                            │   │       ToDoRepository.kt
                            │   │
                            │   └───viewmodel
                            │           ToDoViewModel.kt
                            │
                            ├───fragments
                            │   │   BaseViewModel.kt
                            │   │   BindingAdapters.kt
                            │   │
                            │   ├───add
                            │   │       AddFragment.kt
                            │   │
                            │   ├───list
                            │   │   │   ListFragment.kt
                            │   │   │   SwipeToDelete.kt
                            │   │   │
                            │   │   └───adapter
                            │   │           ListAdapter.kt
                            │   │           ToDoDiffUtil.kt
                            │   │
                            │   └───update
                            │           UpdateFragment.kt
                            │
                            └───utils
                                    Utils.kt
```

## License
```
MIT License

Copyright (c) 2020 Easy Task

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

 

