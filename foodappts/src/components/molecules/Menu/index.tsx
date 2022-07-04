import React, { useState } from "react";
import FoodData from "../../../data/foodData";
import Info from "../Info";

type menuProps = {
  id: number;
  dist: number;
};

const restaurantCardStyle = {
  width: "230px",
  height: "190px",
  border: "1px solid black",
  borderRadius: "5px",
  margin: "15px",
};

const outerStyle = {
  display: "grid",
  width: "100%",
  gridTemplateColumns: "auto auto auto auto",
};

const buttonStyle = {
  padding: "20px",
  marginBottom: "30px",
};

function Menu(props: menuProps) {
  const [next, setNext] = useState(0);
  const [total, setTotal] = useState(0);
  return (
    <>
      {next === 0 ? (
        <>
          <div style={outerStyle}>
            {FoodData[props.id].Menu.map((item) => (
              <div
                style={restaurantCardStyle}
                onClick={() => {
                  setTotal(total + item.price);
                  console.log(total);
                }}
              >
                Item - {item.name}
                <br />
                <br />
                price - {item.price}
              </div>
            ))}
          </div>

          <div style={buttonStyle}>
            <button onClick={() => setNext(1)}>
              <h1>Proceed</h1>
            </button>
          </div>
        </>
      ) : (
        <Info total={total} dist={props.dist}></Info>
      )}
    </>
  );
}

export default Menu;
