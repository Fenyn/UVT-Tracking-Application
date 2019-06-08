# UVT Tracking Application
> Made for Gomo Code Challenge

This project creates an object that can store 'view fragments' of videos and then calculate the 'unique view time' (UVT) of the video.

## Installing / Getting started
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
Finally, we provide those fragments as input to uvt_Calculator.CalculateTotalUVT() and print the result.

## Features

What's all the bells and whistles this project can perform?
* TBD

## Configuration

Here you should write what are all of the configurations a user can enter when
using the project.

#### Argument 1
Type: `String`  
Default: `'default value'`

State what an argument does and how you can use it. If needed, you can provide
an example below.

Example:
```bash
awesome-project "Some other value"  # Prints "You're nailing this readme!"
```

#### Argument 2
Type: `Number|Boolean`  
Default: 100

Copy-paste as many of these as you need.



## Licensing
"The code in this project is licensed under GNU General Public License v3.0."
