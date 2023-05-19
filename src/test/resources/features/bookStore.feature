@wip
Feature: BookStore Circle

  @getAllBooks
  Scenario: Scenario-1
    Given Get all books
    Then Validate that the books are listed

  #Add new user
  @addNewUser
  Scenario: Scenario-2
    Given Add new user
    Then Validate that the user is created

  #Genrate token
  @generateToken
  Scenario: Scenario-3
    Given Generate Token
    Then Validate that the token is generated

  #Authorized user
  @authorizedUser
  Scenario: Scenario-4
    Given Authorize User
    Then Validate that the user is authorized

  #Add new book
  @addNewBook
  Scenario: Scenario-5
    Given Add new book to the user
    Then Validate that the book is assigned to the user

  #Get user information
  @getUserInfo
  Scenario: Scenario-6
    Given Get user Information
    Then Validate that the user information is correct

  #Update book
  @updateBook
  Scenario: Scenario-7
    Given Update first book with the second one
    Then Validate that the book is updated

  #Delete book
  @deleteBook
  Scenario: Scenario-8
    Given Delete the book
    Then Validate that the book is deleted