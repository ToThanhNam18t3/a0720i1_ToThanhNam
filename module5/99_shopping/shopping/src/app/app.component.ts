import { Component } from '@angular/core';
import { ProductList } from './product-list/ProductList';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  products : ProductList[] = [
    {productId: "1", name: "Samsung ZFold 2" , description: " Một chiếc điện thoại cao cấp tới từ thương hiệu Samsung" , thumbnail: "/assets/zfold2.jpg" , price : 5.99 , quantity : 1} , 
    {productId: "2", name: "Google Pixel 4 XL" , description: " Một chiếc điện thoại cao cấp tới từ thương hiệu Google" , thumbnail: "/assets/pixel4xl.jpg" , price : 9.99 , quantity : 1} , 
    {productId: "3", name: "Samsung ZFold 2" , description: " Một chiếc điện thoại cao cấp tới từ thương hiệu Samsung" , thumbnail: "/assets/zfold2.jpg" , price : 5.99 , quantity : 5}
  ];

  

}
