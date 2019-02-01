import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeService } from './home.service';
import { User } from '../model/user';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

    public user: User = new User();
    public useName = 'yes';

  constructor(public homeService: HomeService, public router: Router) { }

  ngOnInit() {
  }

 login() {
    console.log('signin button click ' , this.user.userName, this.user.password);
    this.homeService.login(this.user).subscribe(
       ( res: Boolean) => {
            if (res) {
                this.router.navigate(['student/list']);
            }
        }
    );
  }

   signup() {
     console.log('signup button click');
    // const obj = this.homeService.login(this.user);
    // console.log('call completed');
     this.router.navigate(['student/list']);
  }

}
