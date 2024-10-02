Iterator Pattern Example: Book Collection
Overview
This implementation demonstrates the Iterator Pattern using a book collection system. The Iterator Pattern allows for sequential access to elements of a collection without exposing its underlying representation. In this case, the pattern is applied to a BookCollection that stores Book objects.

Classes
1. Book
Represents an individual book.
Attributes:
title: A string that holds the title of the book.
Methods:
getTitle(): Returns the title of the book.
2. BookCollection
A collection class that stores multiple Book objects.
Attributes:
books: A list that holds Book objects.
Methods:
addBook(Book book): Adds a Book to the collection.
iterator(): Returns an iterator to traverse the collection, allowing for sequential access to the Book objects.
3. Main (Iterator Class)
Demonstrates the use of the Iterator Pattern.
Actions:
Creates a BookCollection, adds books to it, and iterates over the collection using the for-each loop.
Usage
Book objects are created with titles.
A BookCollection is used to store these books.
By implementing the Iterable interface in BookCollection, the iterator can be used to loop through the books in the collection.
How It Works
Iterator Pattern: The pattern provides a way to access the elements in the collection one by one.
Iterable Interface: The BookCollection implements Iterable<Book>, allowing the collection to be used in a for-each loop or manually using an iterator.