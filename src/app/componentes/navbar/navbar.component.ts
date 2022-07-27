import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor() { }

  darkMode: boolean = false;

  cambio() {
    document.body.classList.toggle('dark');
    this.darkMode = !this.darkMode;
  }


  ngOnInit(): void {
  }


}

