import React, {useEffect} from 'react';
import {BottomNavigation, BottomNavigationAction, makeStyles} from "@material-ui/core";
import StarIcon from '@material-ui/icons/Star';
import WhatshotIcon from "@material-ui/icons/Whatshot";
import { useHistory } from "react-router-dom";

const useStyles = makeStyles({
    root: {
        width: "100%",
        position: "fixed",
        bottom: 0,
        backgroundColor: "#2d313a",
        zIndex: 100,
    },
});

export const BottomRouterNavigation = () => {
    const classes = useStyles();
    const [value, setValue] = React.useState(0);
    const history = useHistory();

    useEffect(() => {
        if (value === 0) {
            history.push("/");
        } else if (value === 1) {
            history.push("/rated");
        }
    }, [value, history]);

    return (
        <BottomNavigation
            value={value}
            onChange={(event, newValue) => {
                setValue(newValue);
            }}
            showLabels
            className={classes.root}
        >
            <BottomNavigationAction
                style={{ color: "white" }}
                label="Trending"
                icon={<WhatshotIcon />}
            />
            <BottomNavigationAction
                style={{ color: "white" }}
                label="Rated"
                icon={<StarIcon />}
            />
        </BottomNavigation>
    );
};
