# BookStoreBackendApp

# BookStore Project>

### UserRegistration>
(Register,getAll,getbyID,login,forgotPassword/changePassword,GetbyEmailID,updateuser)
UserID
FirstName
LastName
Email
address
Password	

token
sendMail(get/token)

### Book>
(insert,getAll,getbyID,delete,searchbyBookName,updateBookbyID,sortingAsce,sortingDesc,updateQuantity)
Id
bookName
autherName
bookDescription
bookImg
price
quantity

### Cart>
(insert,getall,getbyID,delete,updatebyID,updateQuantity)
cartID
User
Book
quantity

### Order>
(insert,getall,getbyID,cancelorder)
orderID
Date :LocalDate.now()
price
quantity
address
user
book
boolean cancel
