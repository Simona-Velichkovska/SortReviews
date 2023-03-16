# SortReviews
EmbedSocial Challenge 

  **Requirements for this project:**
```
-Spring Boot
-Java 11 or higher
```
IDE used:
**IntelliJ IDEA 2022.2.3**

To run the application which is on port 3000 the link is: **http://localhost:3000/**

The **JSON data is deserialized** using **Jackson**: https://www.baeldung.com/jackson



Using Spring I was able to create the web application that filters out reviews like it was stated in the challenge.
When you get into the application you see the following window:

![image](https://user-images.githubusercontent.com/26824973/225621136-7ae54f22-b8df-45a0-941e-5ac791d89a43.png)



Let's see a couple of test cases:

Test Case 1:
- Order by rating: Highest First
- Minimum rating: 3
- Order by date: Oldest First
- Prioritize by text: Yes

Output 1:
![image](https://user-images.githubusercontent.com/26824973/225622038-7b95e3a7-6208-4962-b3c9-fba1206dbbc8.png)

By this test case we can tell that the function for prioritizing by text isn't working like it's supposed to. While the other functions are working as they should. 




