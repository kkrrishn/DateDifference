# Date Difference Java Library

A Java library for calculating date differences, such as the number of days, weeks, months, or years between two dates.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- - [Format](#format)
- [Examples](#examples)



## Introduction

This Java library provides a convenient way to calculate date differences in various units, making it easy to work with date-related calculations in your Java projects. It can be useful for tasks like calculating the age of a person, the number of days between two events, and more.

## Features

- Calculate the number of days between two dates.
- Calculate the number of weeks between two dates.
- Calculate the number of months between two dates.
- Calculate the number of years between two dates.
- Customizable date formatting options.
- Comprehensive documentation and examples.

## Installation

Download DateDifference Java File in Same Directory Where your project file have 
```import DateDFT.DateDifference;
or
```import Your_directory.DateDFT.DateDifference;

### Maven

Add the following dependency to your project's `pom.xml` file:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>date-difference-library</artifactId>
    <version>1.0.0</version>
</dependency>

## Usage
```DateDifference dt = new DateDifference( new_Year,new_Month,new_DateOfMonth,old_Year, old_Month,old_DateOfMonth);

or
```DateDifference dt = new DateDifference(newDate, oldDate, Format);


##Formate

Format 1  "dd/mm/yyy"
or
format 2 "dd-mm-yyy"


## Examples

import com.example.DateDFT.DateDifference;

public class DateDifferenceExample {
    public static void main(String[] args) {
        int new_Year =2023,
       new_Month = 05,
      new_DateOfMonth = 22,
      old_Year = 1997,
      old_Month = 04,
      old_DateOfMonth = 26;
        DateDifference dt = new DateDifference( new_Year,new_Month,new_DateOfMonth,old_Year, old_Month,old_DateOfMonth);
        
        // Calculate the number of days between two dates
        System.out.println("Years difference: " + dt.getYear());
        System.out.println("Months difference: " + dt.getMonth());
        System.out.println("Days difference: " + dt.getDayOfMonth());
        System.out.println("Tota Months Between Dates : " + dt.getAllMonth());
        System.out.println("Tota Days Between Dates difference: " + dt.getAllDayOfMonth());
        System.out.println("Tota Hours Between Dates: " + dt.getInHour());
        System.out.println("Tota Minutes Between Dates: " + dt.getMints());
        System.out.println("Tota Seconds Between Dates: " + dt.getSecond());
    }
}


Second Exampple

public class DateDifferenceExample {
    public static void main(String[] args) {
        String newDate = "13/05/2023", oldDate = "11/05/2000", Format ="dd/mm/yyy"; 
        DateDifference dt = new DateDifference( newDate, oldDate, Format);
        
        // Calculate the number of days between two dates
        System.out.println("Years difference: " + dt.getYear());
        System.out.println("Months difference: " + dt.getMonth());
        System.out.println("Days difference: " + dt.getDayOfMonth());
        System.out.println("Tota Months Between Dates : " + dt.getAllMonth());
        System.out.println("Tota Days Between Dates difference: " + dt.getAllDayOfMonth());
        System.out.println("Tota Hours Between Dates: " + dt.getInHour());
        System.out.println("Tota Minutes Between Dates: " + dt.getMints());
        System.out.println("Tota Seconds Between Dates: " + dt.getSecond());
    }
}


