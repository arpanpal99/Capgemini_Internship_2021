const express = require('express')
const router = express.Router() 
const User = require('../models/user') 
const mongoose = require('mongoose')
const db = "mongodb://localhost:27017/eventsDB"
const jwt = require('jsonwebtoken')

var { Book } = requre('../models/books')

//mongo local --eval "db.dropDatabase()" ->If error occurs mongo stop and then mogo restart
mongoose.connect(db,err=> {
    if(err)
    {
        console.error('Error: '+ err)
    }else{
        console.log('Connection Established to MongoDB')
    }
});

function verifyToken(req, res, next)
{
  if(!req.headers.authorization)
  {
    return res.status(401).send('Unauthorized Access request')
  } 
  let token = req.headers.authorization.split(' ')[1]
  if(token === 'null'){
     return res.status(401).send('Unauthorized Access Request')
  }

  let payload = jwt.verify(token , 'secretKey')
  if(!payload)
  {
    return res.status(401).send('Unauthorized Access Request')     
  }
  req.userId = payload.subjectnext() 
}

router.get('/',(req,res)=>{
res.send('From API Route')
})

router.post('/register',(req,res)=>
{
    let userData = req.body
    let user = new User(userData)
    user.save((error, registeredUser)=> {
        if(error)
        {
            console.log(error)
        }else{
            let payload = { subject : registeredUser._id}
            let token = jwt.sign(payload, 'secretKey')
            //res.status(200).send(registeredUser)
            res.status(200).send({token})
        }
    })
})

router.post('/login',(req,res)=>{

    let userData = req.body
    User.findOne({email: userData.email}, (error,user)=>{
        if(error)
        {
            console.log(error)
        }else{
            if(!user)
            {
                res.status(401).send('invalid Email')
            }else
            if(user.password !== userData.password) {
                res.status(401).send('invalid Password')
            }
            else{
              let payload = { subject : user._id}
              let token = jwt.sign(payload, 'secretKey')
              //res.status(200).send(user)
              res.status(200).send({token})
            }
        }

    } )
})

router.get('/books',(req, res)=>{

    let books =  [
        {
          "id": 1,
          "title": "Android for Expert",
          "year": 1996,
          "author": "George R. R"
        },
        {
          "id": 2,
          "title": "Complete Reference",
          "year": 1998,
          "author": "George P. R. Martin"
        },
        {
          "id": 3,
          "title": "BackBone JS",
          "year": 2000,
          "author": "Kalvin R.V"
        },
        {
          "id": 4,
          "title": "Knock Out JS",
          "year": 2005,
          "author": "J.J Markin"
        },
        {
          "id": 5,
          "title": "Pointer in C",
          "year": 2011,
          "author": "Y P Kanitkar"
        },
        {
          "id": 6,
          "title": "Big Data",
          "year": 2011,
          "author": "Pearson D A"
        },
        {
          "id": 7,
          "title": "A Dream of Spring",
          "year": 2012,
          "author": "George R. R. Martin"
        },
        {
          "id": 8,
          "title": "The Philosopher's Stone",
          "year": 1997,
          "author": "J. K. Rowling"
        },
        {
          "id": 9,
          "title": "The Chamber of Secrets",
          "year": 1998,
          "author": "J. K. Rowling"
        },
        {
          "id": 10,
          "title": "The Prisoner of Azkaban",
          "year": 1999,
          "author": "J. K. Rowling"
        }
        
      ]
    res.json(books)

})

router.get('/specialBooks', verifyToken ,(req, res)=>{

    let books =  [
        {
          "id": 1,
          "title": "Android for Expert",
          "year": 1996,
          "author": "George R. R"
        },
        {
          "id": 2,
          "title": "Complete Reference",
          "year": 1998,
          "author": "George P. R. Martin"
        },
        {
          "id": 3,
          "title": "BackBone JS",
          "year": 2000,
          "author": "Kalvin R.V"
        },
        {
          "id": 4,
          "title": "Knock Out JS",
          "year": 2005,
          "author": "J.J Markin"
        }
        // ,
        // {
        //   "id": 5,
        //   "title": "Pointer in C",
        //   "year": 2011,
        //   "author": "Y P Kanitkar"
        // },
        // {
        //   "id": 6,
        //   "title": "Big Data",
        //   "year": 2011,
        //   "author": "Pearson D A"
        // },
        // {
        //   "id": 7,
        //   "title": "A Dream of Spring",
        //   "year": 2012,
        //   "author": "George R. R. Martin"
        // },
        // {
        //   "id": 8,
        //   "title": "The Philosopher's Stone",
        //   "year": 1997,
        //   "author": "J. K. Rowling"
        // },
        // {
        //   "id": 9,
        //   "title": "The Chamber of Secrets",
        //   "year": 1998,
        //   "author": "J. K. Rowling"
        // },
        // {
        //   "id": 10,
        //   "title": "The Prisoner of Azkaban",
        //   "year": 1999,
        //   "author": "J. K. Rowling"
        // }
        
      ]
    res.json(books)

})

module.exports=router