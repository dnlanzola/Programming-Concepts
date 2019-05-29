   /***********************\
   *      Assignment 8     *
   * Daniel Anzola Delgado *
   \***********************/

//*******************************************************************\\
// File: Person.java                                                 \\
//                                                                   \\
// Information:                                                      \\
//   1. SET & GET methods for each private variable.                 \\
//   2. Constructor - sets information for objects type              \\
//      Person with inputs from user.                                \\
//   3. EnrolledPeople Method - returns the number of people.        \\
//                                                                   \\
//*******************************************************************\\


public class Person
{
   /*--- VARIABLES ---*/
   private String category;
   private String name;
   private String id;
   private static int peopleCount;
   
   /* ---CONSTRUCTOR METHOD--- */
   public Person(String newCategory,String newName, String newId)
   {
      category = newCategory;
      name = newName;
      id = newId;
      peopleCount++;
   }
   
   //(1.1) SET - [STRING] category 
   public void setCategory (String newCategory)
   {
      category = newCategory;
   }

   //(1.2) GET - [STRING] category
   public String getCategory()
   {
      return category;
   }

   //(2.1) SET - [STRING] name 
   public void setName (String newName)
   {
      name = newName;
   }

   //(2.2) GET - [STRING] category
   public String getName()
   {
      return name;
   }

   //(3.1) SET - [STRING] id 
   public void setId (String newId)
   {
      id = newId;
   }

   //(3.2) GET - [STRING] category
   public String getId()
   {
      return id;
   }

   /* ---toString METHOD--- */
   public String toString()
   {
      //RETURNS DESCRIPTION OF THE PERSON (NAME, CATEGORY, ID NUMBER)
      return "Name: " + name + "\n" + "Category: " + category + "\n" + "ID Number: " + id + "\n";
   }

   /* ---EnrolledPeople METHOD--- */
   public static int EnrolledPeople()
   {
      //RETURNS NUMBER OF PEOPLE
      return peopleCount;
   }

}