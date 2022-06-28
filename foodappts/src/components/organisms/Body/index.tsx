import CSS from "csstype";
import RestaurantCard from "../../molecules/RestaurantCard";

const bodyDivision: CSS.Properties = {
  display: "flex",
  flexWrap: "wrap",
  height: "613px",
};

const clickButton = {
  width: "80%",
  height: "30px",
  color: "white",
  backgroundColor: "#e0d6d5",
  margin: "auto",
  marginTop: "20px",
  border: "2px solid black",
  borderRadius: "5px",
  cursor: "pointer",
};

const sideNav = {
  flex: 1,
  backgroundColor: "#9ea8a1",
  borderRight: "4px solid black",
};

const mainBody = {
  flex: 4,
  backgroundColor: "#e4f0e7",
};

const buttonText = {
  fontSize: "20px",
  color: "black",
};

function Body() {
  return (
    <div style={bodyDivision}>
      <div style={sideNav}>
        <div style={clickButton}>
          <p style={buttonText}>Restaurants</p>
        </div>
        <div style={clickButton}>
          <p style={buttonText}>Menu</p>
        </div>
        <div style={clickButton}>
          <p style={buttonText}>Order Amount</p>
        </div>
      </div>
      <div style={mainBody}>
        <RestaurantCard></RestaurantCard>
      </div>
    </div>
  );
}

export default Body;
