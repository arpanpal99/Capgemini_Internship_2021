import { Directive, Input, ElementRef, Renderer2, HostListener } from '@angular/core';

@Directive({
  selector: '[appMyOwnDirective]'
})
export class MyOwnDirectiveDirective {

  @Input()
  defaultColor : string;

  @Input('appMyOwnDirective')
  highlightColor : string; 

  //Notes: A wrapper around a native element inside of a View.
  constructor(private el : ElementRef , private renderer : Renderer2) { }

  @HostListener('mouseenter')
  onMouseEnter()
  {
    this.highLight(this.highlightColor || this.defaultColor || 'green');
  }

  @HostListener('mouseleave')
  whenMouseLeave()
  {
    this.highLight(null);
  }

  private highLight(color : string){
      //this.el.nativeElement.style.backgroundColor = color;
      this.renderer.setStyle(this.el.nativeElement,'backgroundColor',color);
  }
}
