import { Pipe, PipeTransform } from '@angular/core';
import { Employee } from '../app/employee'; 


@Pipe({
  name: 'filterPipe'
})
export class FilterPipePipe implements PipeTransform {

  transform(name:string, salary:number): any {
    if(salary>=10000)
      return name;
    else
    return name+' less Sal';   
  }
}
