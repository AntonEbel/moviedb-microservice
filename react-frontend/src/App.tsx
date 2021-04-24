import React from 'react';
import './App.css';
import Header from "./components/Header/Header";
import {BottomRouterNavigation} from "./components/BottomNavigation";
import {BrowserRouter, Route, Switch} from "react-router-dom";
import {Container} from "@material-ui/core";
import {TopMovies} from "./components/Pages/TopMovies/TopMovies";
import {Rated} from "./components/Pages/Rated/Rated";

function App() {
    return (
        <BrowserRouter>
            <Header/>
            <div className="app">
                <Container>
                    <Switch>
                        <Route path="/" component={TopMovies} exact/>
                        <Route path="/rated" component={Rated}/>
                    </Switch>
                </Container>
            </div>
            <BottomRouterNavigation/>
        </BrowserRouter>
    );
}

export default App;
