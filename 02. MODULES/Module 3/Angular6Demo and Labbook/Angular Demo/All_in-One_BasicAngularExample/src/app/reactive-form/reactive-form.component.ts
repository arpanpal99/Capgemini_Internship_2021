import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {

  registerForm: FormGroup
  submitted = false;
  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      firstName: ['' , Validators.required],
      lastName: ['' , Validators.required],
      email: ['' , [Validators.required, Validators.email]],
      password: ['' , [Validators.required, Validators.minLength(6)]]
    });
  }

  get f(){
    return this.registerForm.controls;
  }

  onSubmit(){
    this.submitted = true;
    if(this.registerForm.invalid){
      return;
    }
    alert('Successfullly Submitted');
  }

}
