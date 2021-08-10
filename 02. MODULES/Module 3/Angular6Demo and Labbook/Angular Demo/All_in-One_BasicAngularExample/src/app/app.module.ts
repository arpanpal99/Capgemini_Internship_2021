import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from "@angular/forms"; 
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/app.employee';
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { NgforExampleComponent } from './ng-for-example/ng-for-example.component';
import { NgIfExampleComponent } from './ng-if-example/ng-if-example.component';
import { NgSwitchExampleComponent } from './ng-switch-example/ng-switch-example.component';
import { AttributengStyleExComponent } from './attributeng-style-ex/attributeng-style-ex.component';
import { AttributengClassExComponent } from './attributeng-class-ex/attributeng-class-ex.component';
import { MyOwnDirectiveDirective } from './my-own-directive.directive';
import { OwnDirectiveExComponent } from './own-directive-ex/own-directive-ex.component';
import { BuiltInPipesComponent } from './built-in-pipes/built-in-pipes.component';
import { ParameterizedPipesComponent } from './parameterized-pipes/parameterized-pipes.component';
import { CustomPipesComponent } from './custom-pipes/custom-pipes.component';
import { FilterPipePipe } from './filter-pipe.pipe';
import { LifeCycleHooksComponent } from './life-cycle-hooks/life-cycle-hooks.component';
import { ProductService } from './services/product.service';
import { SerProductComponent } from './ser-product/ser-product.component';
import { HttpGetExComponent } from './http-get-ex/http-get-ex.component';
import { HttpClientModule } from '@angular/common/http';
import { TemplateFormComponent } from './template-form/template-form.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ObservableExComponent } from './observable-ex/observable-ex.component';
import { ChangeDetectExComponent } from './change-detect-ex/change-detect-ex.component';
import { ChangeDetectChildComponent } from './change-detect-child/change-detect-child.component';
import { AnimationExComponent } from './animation-ex/animation-ex.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FlipAnimationExComponent } from './flip-animation-ex/flip-animation-ex.component';
import { Emp21Component } from './emp21/emp21.component';
import { Apr21ParentComponent } from './apr21-parent/apr21-parent.component';
import { Apr21ChildComponent } from './apr21-child/apr21-child.component';

@NgModule({
  declarations: [
    AppComponent,EmployeeComponent, TwoWayBindingComponent, ParentComponent, ChildComponent, 
    NgforExampleComponent, NgIfExampleComponent, NgSwitchExampleComponent, 
    AttributengStyleExComponent, AttributengClassExComponent,
    MyOwnDirectiveDirective, OwnDirectiveExComponent, BuiltInPipesComponent, ParameterizedPipesComponent, CustomPipesComponent, FilterPipePipe, LifeCycleHooksComponent, SerProductComponent, HttpGetExComponent, TemplateFormComponent, ReactiveFormComponent, ObservableExComponent, ChangeDetectExComponent, ChangeDetectChildComponent, AnimationExComponent, FlipAnimationExComponent, Emp21Component, Apr21ParentComponent, Apr21ChildComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule, ReactiveFormsModule, BrowserAnimationsModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
