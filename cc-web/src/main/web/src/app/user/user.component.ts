import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from './user.service';
import { User } from '../model/user';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

    public loginUser: User = new User();
    public registerUser: User = new User();
    public useName = 'yes';

  constructor(public homeService: UserService, public router: Router) { }

  ngOnInit() {
  }

 login() {
    console.log('signin button click ' , this.loginUser.userName, this.loginUser.password);
    this.loginUser.corpEmail = this.loginUser.userName;
    this.loginUser.peronsalEmail = this.loginUser.peronsalEmail;
    this.homeService.login(this.loginUser).subscribe(
       ( res: Boolean) => {
            if (res) {
                this.router.navigate(['home/list']);
            }
        }
    );
  }

   register() {
     console.log('signup button click', this.registerUser);
      this.homeService.register(this.registerUser).subscribe(
        res => {
          console.log(res);
          this.router.navigate(['home/list']);
        }
      );
  }

}
