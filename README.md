# UVT Tracking Application
> Made for Gomo Code Challenge

This project creates an object that can store 'view fragments' of videos and then calculate the 'unique view time' (UVT) of the video.

## Installing / Getting started

### To use this application as an executable, follow these steps:

To use this project, clone or download this repository. Open up this repository, then find and edit launch_UVT.bat. 
Inside, find this line:
```shell
set CLASSPATH=%CLASSPATH%;E:\GitHub Repos\UVT-Tracking-Application\UVT_Calculator_Launcher_Executable.jar
```
and change 'E:\GitHub Repos\UVT-Tracking-Application\UVT_Calculator_Launcher_Executable.jar' to instead point at the location of your local copy of this repository.
I.E. If you've saved this repository at C:\Program Files\UVT-Tracking-Application\, it would read 
```shell
set CLASSPATH=%CLASSPATH%;C:\Program Files\UVT-Tracking-Application\UVT_Calculator_Launcher_Executable.jar
```

Then, simply run the .bat file and follow the prompts on-screen.
It will ask how many fragments you wish to input, then ask you to input the start and then end time for each one sequentially.
Once you've entered all of your fragments, the total UVT will be displayed on screen.


### If you instead wish to use this application through a code interface, follow these steps instead:

To use this project, simply create an array of VideoViewFragments using the class provided in this project,
then create a UVT_Calculator and call the CalculateTotalUVT method using the aforementioned array as input.

```shell
UVT_Calculator uvt_Calculator = new UVT_Calculator();

ArrayList<VideoViewFragment> viewFragmentArrayList = new ArrayList<VideoViewFragment>();
viewFragmentArrayList.add(new VideoViewFragment(0, 15000));
viewFragmentArrayList.add(new VideoViewFragment(1500, 8000));
viewFragmentArrayList.add(new VideoViewFragment(10000, 18000));

int totalUVT = uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList);		

System.out.println(totalUVT);
```

In this example, we create a UVT_Calculator and array of VideoViewFragments. 
Then, we populate the array with three view fragments.
```shell
Fragment 1 - Start Time: 0s, End Time: 15.000s
Fragment 2 - Start Time: 1.500s, End Time: 8.000s
Fragment 3 - Start Time: 10.000s, End Time: 18.000s
```
Finally, provide those fragments as input to uvt_Calculator.CalculateTotalUVT() and it will return an integer as the result, which we then print.

## Features

What's all the bells and whistles this project can perform?
* Store video view fragments as an array
* Sort video view fragments by their view start time
* Calculate the total Unique View Time for an array of view fragments

## Configuration

Here you should write what are all of the configurations a user can enter when
using the project.



## Licensing
The code in this project is licensed under GNU General Public License v3.0.
