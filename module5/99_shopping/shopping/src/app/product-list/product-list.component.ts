import { Component, Input, OnInit } from '@angular/core';
import { ProductList } from './ProductList';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  @Input() products;

  // products : ProductList[] = [
  //   {productId: "1", name: "Samsung ZFold 2" , description: " Một chiếc điện thoại cao cấp tới từ thương hiệu Samsung" , thumbnail: "/assets/zfold2.jpg" , price : 5.99 , quantity : 1} , 
  //   {productId: "2", name: "Google Pixel 4 XL" , description: " Một chiếc điện thoại cao cấp tới từ thương hiệu Google" , thumbnail: "/assets/pixel4xl.jpg" , price : 9.99 , quantity : 1} , 
  //   {productId: "3", name: "Samsung ZFold 2" , description: " Một chiếc điện thoại cao cấp tới từ thương hiệu Samsung" , thumbnail: "/assets/zfold2.jpg" , price : 5.99 , quantity : 5}
  // ]

 
                                                             
  constructor() { }

  ngOnInit(): void {
  }

  removeProduct(productId: string):void{
    alert("Bạn muốn xóa " + productId + "ra khỏi giỏ hàng ?")
    const index = this.products.findIndex(product => product.productId === productId);
    this.products.splice(index , 1)
  }

  updateQuantity(element , productId){
    this.products[productId -1].price =parseInt(element) * 50;
  }

  setPrice(price: number){
      
  }

  // removeProduct(param):void{
  //   alert("Bạn muốn xóa " + param + "ra khỏi giỏ hàng ?")
  // }

}
