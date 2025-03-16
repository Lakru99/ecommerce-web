import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import {
  FontAwesomeModule , FaIconComponent 
} from '@fortawesome/angular-fontawesome';

@Component({
  selector: 'ecom-footer',
  standalone: true,
  imports: [CommonModule,FontAwesomeModule, FaIconComponent],
  templateUrl: './footer.component.html',
  styleUrl: './footer.component.scss',
})
export class FooterComponent {}
