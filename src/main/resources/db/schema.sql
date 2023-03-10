CREATE TABLE IF NOT EXISTS BOOK_CATEGORY(
    category_id SERIAL PRIMARY KEY ,
    category_name VARCHAR(50) NOT NULL,
    category_desc VARCHAR(500)
);

CREATE TABLE IF NOT EXISTS BOOK(
    book_id SERIAL PRIMARY KEY ,
    book_name VARCHAR(500) NOT NULL,
    book_author VARCHAR(500) NOT NULL,
    Price DECIMAL(10,2),
    Publisher VARCHAR(500),
    Edition VARCHAR(10),
    Status VARCHAR(5),
    isbn_number VARCHAR(100),
    Category INTEGER REFERENCES BOOK_CATEGORY(category_id)
);