import React, {useEffect, useState} from 'react';
import axios from "axios";
import {Movie} from "../../../Types";
import {SingleMovie} from "../../SingleMovie/SingleMovie";
import "./TopMovies.css"

export const TopMovies = () => {

    const [content, setContent] = useState<Movie[]>([]);

    const fetchTop = async () => {
        const {data} = await axios.get("http://localhost:8082/v1/movies/top")
        setContent(data)
        console.log(data)
    }

    useEffect(() => {
        fetchTop()
    }, [])
    return (
        <div>
            <span className="pageTitle">Top Movies</span>
            <div className="topmovies">
                {
                    content && content.map((value) => {
                        return <SingleMovie key={value.id} movie={value}/>
                    })
                }
            </div>
        </div>
    );
};
