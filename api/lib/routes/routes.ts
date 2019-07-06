import {Request, Response, Application} from "express";

export class Routes {

    
    public routes(app: Application): void {          
        app.route('/')
        .get((req: Request, res: Response) => {            
            res.send("Welcome.")
        })
        
        app.route('/map')
        .get((req: Request, res: Response) => {            
            res.render("./map.ts")
        })
    }
}