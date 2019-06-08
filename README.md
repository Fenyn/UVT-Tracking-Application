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
* What's the main functionality
* You can also do another thing
* If you get really randy, you can even do this

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

## Contributing

When you publish something open source, one of the greatest motivations is that
anyone can just jump in and start contributing to your project.

These paragraphs are meant to welcome those kind souls to feel that they are
needed. You should state something like:

"If you'd like to contribute, please fork the repository and use a feature
branch. Pull requests are warmly welcome."

If there's anything else the developer needs to know (e.g. the code style
guide), you should link it here. If there's a lot of things to take into
consideration, it is common to separate this section to its own file called
`CONTRIBUTING.md` (or similar). If so, you should say that it exists here.

## Links

Even though this information can be found inside the project on machine-readable
format like in a .json file, it's good to include a summary of most useful
links to humans using your project. You can include links like:

- Project homepage: https://your.github.com/awesome-project/
- Repository: https://github.com/your/awesome-project/
- Issue tracker: https://github.com/your/awesome-project/issues
  - In case of sensitive bugs like security vulnerabilities, please contact
    my@email.com directly instead of using issue tracker. We value your effort
    to improve the security and privacy of this project!
- Related projects:
  - Your other project: https://github.com/your/other-project/
  - Someone else's project: https://github.com/someones/awesome-project/


## Licensing

One really important part: Give your project a proper license. Here you should
state what the license is and how to find the text version of the license.
Something like:

"The code in this project is licensed under MIT license."
