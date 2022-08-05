# Pick-a-Date-in-any-Online-Date-Widget
Assignment 1 W9D5 - SDA - Software QA Bootcamp

## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
Create an automation script using Selenium to pick a date.
- STEP 1: Find the website (to pick the date)
- STEP 2: Evoke the browser
- STEP 3: Navigate to website
- STEP 4: Find the web element to pick the date
- STEP 5: Pick the date

## Answer
Web Crawling is useful to automate certain tasks performed routinely and popular way of information gathering mechanism on websites.

and I used for solving this assignment the following reference [Web Crawling [Java][Selenium]](https://medium.com/tech-vision/web-crawling-java-selenium-8805fc006db1)


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then take web elements, and then add them to the code.
<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/183088636-ccea9415-e0f2-4832-9457-030f768f8e82.png" width=60% height=60%>
</p>

For this assignment I use `LocalDateTime`  class to take current date , and `DateTimeFormatter` class to separate the date into day,month,and year.
Then I entered them in input element.

- Current date

```md
LocalDateTime now = LocalDateTime.now();
```


- The date in specific format

```md
DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");
```


- Save date as string

```md
String dayText= day.format(now);
String monthText= month.format(now);
String yearText= year.format(now);
```


---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/183098035-267e6240-c841-42b3-bf2b-ae73ab1894f0.png" width=80% height=80%>

https://user-images.githubusercontent.com/48597284/183098048-ffb571a4-c41c-4ed7-ae6b-6cf65ab32098.mp4

</p>
