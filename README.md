# CodeChefDetainer
A java web scraping project to fetch user data from user id from codechef.com
CodechefDataManager

<a href="https://www.google.com/search?q=codechef+images&rlz=1C1ONGR_enIN989IN989&sxsrf=APq-WBumA8LvXcf4pFZmDGO0etmPGXw9Xg:1647687898348&source=lnms&tbm=isch&sa=X&ved=2ahUKEwi5yIbfg9L2AhVSTGwGHU1oDKgQ_AUoAnoECAEQBA&biw=1536&bih=714&dpr=1.25#imgrc=ecQ9JUPp7YLriM"> </a>
**-> This is the main class which contains all of the functionalities**

->  List of functions and their short description

-**> void setUserId(String userId)**
         :Used to set the userId of the user for which we want to fetch details
   
**-> int getUserCurrentRating()**
         :This function returns current rating of the user
   
**-> String getUserName()**
         :returns Name of the user
  
**-> List getSolvedProblems()**
         :returns list of problems (problem codes) solved (completely) by user
  
**-> int partialSolvedCount()**
         :returns list of problems (problem codes) solved (partially) by user
   
**-> int partialSolvedCount()**
         :returns number of problems solved (partially) by user
   
**->int fullySolvedCount()**
         :returns number of problems solved (completely) by user
