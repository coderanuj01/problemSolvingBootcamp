import React from "react";
import CSS from "csstype";

const headStyles = {
  height: "104px",
  width: "100%",
  backgroundColor: "#87ad91",
  paddingTop: "10px",
  display: "flex",
  justifyContent: "space-between",
  borderBottom: "4px solid black",
};

const headText: CSS.Properties = {
  fontSize: "56px",
  color: "white",
  textAlign: "left",
  marginLeft: "30px",
};

const imageStyle = {
  height: "90px",
  width: "130px",
  borderRadius: "5px",
  marginRight: "30px",
};

function Header() {
  return (
    <>
      <div style={headStyles}>
        <p style={headText}>Food App</p>
        <img
          src="https://i.pinimg.com/564x/bc/f6/47/bcf6473a0e2e4e3ccfeaa8bf7c5198a7.jpg"
          alt="noodle"
          style={imageStyle}
        />
      </div>
    </>
  );
}

export default Header;
