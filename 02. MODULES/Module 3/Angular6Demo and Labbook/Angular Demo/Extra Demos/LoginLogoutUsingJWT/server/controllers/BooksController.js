const express = require ('express')
var router = express.Router();

var { Book } = requre('../models/books')

router.get('/', (req, res) =>
{
    Book.find((err,docs)=>{
        if(!err) {
            res.send(docs);
        }
        else
        {
            console.log('Error in Retreiving Books '+JSON.stringify(err, undefined, 2));
        }
    });
})

module.exports = router; 