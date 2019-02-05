import { Injectable } from '@angular/core';
import { User } from '../model/user';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';

@Injectable()
export class UserService {

    constructor(public http: HttpClient) { }

    login(user: User): Observable<Boolean> {
        const data = JSON.stringify(user);
        const httpHeaders = new HttpHeaders({
            'Content-Type': 'application/json',
            'Cache-Control': 'no-cache'
        });
        const options = {
            headers: httpHeaders
        };

        return this.http.post<Boolean>('/api/user/login', data, options);
    }

     register(user: User): Observable<User> {
        const data = JSON.stringify(user);
        const httpHeaders = new HttpHeaders({
            'Content-Type': 'application/json',
            'Cache-Control': 'no-cache'
        });
        const options = {
            headers: httpHeaders
        };

        return this.http.post<User>('/api/user/register', data, options);
    }
}
