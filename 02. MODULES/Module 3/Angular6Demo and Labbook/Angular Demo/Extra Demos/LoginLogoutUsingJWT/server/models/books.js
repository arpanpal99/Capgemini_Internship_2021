const mongoose = require('mongoose')

var Books = mongoose.model('Books', {
    id : { type:Number},
    title : { type : String },
    year : { type : Number },
    author : { type : String } 
})

module.exports = Book;
