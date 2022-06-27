import React, { useState } from "react";
import FoodData from "../../data/foodData";
import Menu from "./Menu";

const restaurantCardStyle = {
  width: "230px",
  height: "240px",
  border: "1px solid black",
  borderRadius: "5px",
  margin: "15px",
};

const outerStyle = {
  display: "grid",
  width: "100%",
  gridTemplateColumns: "auto auto auto auto",
};

function RestaurantCard() {
  const [screen, setScreen] = useState(0);
  const [distance, setDistance] = useState(0);

  return (
    <>
      {screen === 0 ? (
        <div style={outerStyle}>
          {FoodData.map((item) => (
            <div
              style={restaurantCardStyle}
              onClick={() => {
                setScreen(item.id);
                setDistance(item.distance);
              }}
            >
              <h3>{item.restaurant}</h3>
              <br />
              <h4>{item.distance} Kms Away</h4>
              <br />
              Green estate Area New Delhi 102030
              <br />
              <br />
              Rs 300 per person
            </div>
          ))}
        </div>
      ) : (
        (console.log(screen), (<Menu id={screen} dist={distance}></Menu>))
      )}
    </>
  );
}

export default RestaurantCard;
