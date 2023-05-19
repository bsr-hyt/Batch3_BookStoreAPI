package com.bookstore.step_defs;

import com.bookstore.services.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BookStore_StepDefs {

    GetAllBooks getAllBooks = new GetAllBooks();
    AddNewUser addNewUser = new AddNewUser();
    GenerateToken generateToken = new GenerateToken();
    AuthorizedUser authorizedUser = new AuthorizedUser();
    AddNewBook addNewBook = new AddNewBook();
    GetUserInfo getUserInfo = new GetUserInfo();
    UpdateBook updateBook = new UpdateBook();
    DeleteBook deleteBook = new DeleteBook();


    @Given("Get all books")
    public void get_all_books() {
        getAllBooks.getAllBooks();
    }

    @Then("Validate that the books are listed")
    public void validate_that_the_books_are_listed() {
        getAllBooks.validateThatAllBooksAreListed();
    }

    @Given("Add new user")
    public void add_new_user() {
        addNewUser.addNewUser();
    }

    @Then("Validate that the user is created")
    public void validate_that_the_user_is_created() {
        addNewUser.validateThatUserIsAdded();
    }

    @Given("Generate Token")
    public void generate_Token() {
        generateToken.generateToken();
    }

    @Then("Validate that the token is generated")
    public void validate_that_the_token_is_generated() {
       generateToken.validateThatTheTokenIsGenerated();
    }

    @Given("Authorize User")
    public void authorize_User() {
        authorizedUser.authorizeUser();
    }

    @Then("Validate that the user is authorized")
    public void validate_that_the_user_is_authorized() {
        authorizedUser.validateThatUserIsAuthorized();
    }

    @Given("Add new book to the user")
    public void add_new_book_to_the_user() {
        addNewBook.addNewBook();
    }

    @Then("Validate that the book is assigned to the user")
    public void validate_that_the_book_is_assigned_to_the_user() {
        addNewBook.validateThatTheBookIsAssignedToTheUser();
    }

    @Given("Get user Information")
    public void get_user_Information() {
        getUserInfo.getUserInformation();
    }

    @Then("Validate that the user information is correct")
    public void validate_that_the_user_information_is_correct() {
        getUserInfo.validateThatUserInformationIsCorrect();
    }

    @Given("Update first book with the second one")
    public void update_first_book_with_the_second_one() {
        updateBook.updateBookNumber();
    }

    @Then("Validate that the book is updated")
    public void validate_that_the_book_is_updated() {
        updateBook.validateThatBookIsUpdated();
    }

    @Given("Delete the book")
    public void delete_the_book() {
        deleteBook.deleteBook();
    }

    @Then("Validate that the book is deleted")
    public void validate_that_the_book_is_deleted() {
        deleteBook.validateThatBookIsDeleted();
    }







}
