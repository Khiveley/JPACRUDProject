# JPACRUDProject

# Overview

This week's project is to create a simple CRUD on a single table database of your choosing.  Using MySQL Workbench, I created a database to allow for CREATE, READ, UPDATE, and DELETE Pokemon cards. With the database created, I created a JPA project to map into the SellerListings entity all of the fields that were created by my database.  I verified that my mappings worked through a JUnit test to assert that the mapping wasn't null and that each selected field equaled the data from the database.  Using Spring Boot, we integrated the project with JPA using a controller, dao, daoimpl, and jsp files.

# How to Use
Import the JPACrudProject file into your preferred IDE.  This project was created and tested using Spring Tool Suite 4.  Using a browser, input localhost:8083 in the url window.  Start the project from the Boot Dashboard and allow the code to process.  Going to your browser, you should be able to run the JPACRUDProject.

# Technologies Used

* Java
* Apache Tomcat
* MySQL Workbench
* JPA
* Spring Boot

# Lessons Learned

Facets of this project proved challenging.  In creating my database, I tried to provide a similar feel for the data that one would see if searching for a collectible card game card on eBay.  In this case, I referenced actual cards from my collection (for sale by the way) to display.  Admittedly, I was over ambitious in the fields that were created and didn't realize how much of a challenge it would be to map and run CRUD operations until I started working on my entity on the JPA side.  I decided to pare down my field mappings to around 8 or so but kept the data intact in my database.  As a stretch goal, I may build this out in its entirety at some future point.  After creating my SpringMVC project methods for CREATE and UPDATE, I learned that one of my fields in MySQL was a reserve word.  Condition which references how the card appears to the naked eye had to be updated to card_condition and forward engineered.  I then updated JPA and retested.  My methods then worked.  In my current iteration of my application, the DELETE operation works and can be verified by refreshing the local8083 host in the browser.  I'm uncertain as to why when run you cannot return to the home page directly; however, all of the CRUD functions work.

I have learned that html and css styling aren't entirely comfortable. I had fun with experimenting with moving various elements around on the page and refreshing the Spring Boot project and then my localhost connection to better visualize how the changes made in code would appear on the Web.  I will continue to hone my html, css, and bootstrap skills as it is incredibly rewarding to see my code output in a pleasing manner.
