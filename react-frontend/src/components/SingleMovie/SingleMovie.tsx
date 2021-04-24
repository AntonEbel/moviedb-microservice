import React from 'react';
import {Movie} from "../../Types";
import "./SingleMovie.css"

interface Props {
    movie: Movie
}

export const SingleMovie = (props: Props) => {
    return (
        <div className="media">
            <img className="poster" src={`${props.movie.poster}`} alt={`${props.movie.name}`}/>
            <b className="title">{props.movie.name}</b>
        </div>
    );
};
