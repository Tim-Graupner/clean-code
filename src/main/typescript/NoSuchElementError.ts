export class NoSuchElementError implements Error {

    name : string = 'NoSuchElementError';

    constructor(public message : string){

    }

    toString() : string {
        return `${name}: ${this.message}`;
    }

}