/*
Gabriel Suarez
A00368589
*/

package model;

public class User{

  private String userName;
  private String password;
  private int ageUser;
  private CategoryUser categoryUser;
  private int amountCategory;

  public User(String userName, String password, int ageUser){
    this.userName = userName;
    this.password = password;
    this.ageUser = ageUser;
    this.categoryUser = CategoryUser.newbie;
    this.amountCategory = amountCategory;
  }

  public String getUserName(){
    return userName;
  }

  public void setUserName(String name){
    this.userName = userName;
  }

  public String getPassword(){
    return password;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public int getAgeUser(){
    return ageUser;
  }

  public void setAgeUser(int ageUser){
    this.ageUser = ageUser;
  }

  public CategoryUser getCategoryUser(){
    return categoryUser;
  }

  public void setCategoryUser(CategoryUser categoryUser){
    this.categoryUser = categoryUser;
  }

  public int getAmountCategory(){
    return amountCategory;
  }

  public void setAmountCategory(int amountCategory){
    this.amountCategory = amountCategory;
  }

  public String showDataUser(){
    String dataUser = "************ User ************\n";
    dataUser += "** User: "+getUserName()+"\n";
    dataUser += "** Age: "+getAgeUser()+"\n";
    dataUser +="** Category:  "+getCategoryUser()+"\n";
    dataUser += "******************************\n";
    return dataUser;
  }

  public CategoryUser newCategory(String categoryChange){
    CategoryUser myUserCategory = CategoryUser.valueOf(categoryChange);
    return myUserCategory;
  }
}
