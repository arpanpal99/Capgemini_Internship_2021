import { Component, OnInit, Input, ChangeDetectionStrategy} from '@angular/core';

@Component({
  selector: 'app-change-detect-child',
  templateUrl: './change-detect-child.component.html',
  styleUrls: ['./change-detect-child.component.css'] ,
  //changeDetection : ChangeDetectionStrategy.Default
  changeDetection : ChangeDetectionStrategy.OnPush
})
export class ChangeDetectChildComponent implements OnInit {

  @Input()
  data: any;

  constructor() { }

  ngOnInit() {
  }

}
