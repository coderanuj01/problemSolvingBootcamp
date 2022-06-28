import React from "react";

type infoProps = {
  total: number;
  dist: number;
};

const infoStyle = {
  height: "497px",
  width: "897px",
  border: "2px solid black",
  borderRadius: "5px",
  margin: "auto",
  marginTop: "40px",
};

const infoChildStyle = {
  width: "860px",
  height: "60px",
  border: "1px solid black",
  borderRadius: "5px",
  margin: "auto",
  marginTop: "20px",
  display: "flex",
  justifyContent: "space-between",
};

const innerStyle = {
  fontSize: "25px",
  marginLeft: "30px",
  marginRight: "30px",
  marginTop: "10px",
};

const btnStyle = {
  width: "150px",
  height: "40px",
  border: "1px solid black",
  borderRadius: "5px",
  margin: "auto",
  fontSize: "20px",
  backgroundColor: "green",
};

function Info(props: infoProps) {
  const { total, dist } = props;
  let deliveryCharge = Math.ceil((dist / 3 + 1) * 30);

  let discountToGive = total + deliveryCharge - total * 0.9;

  let discountRate = (
    (discountToGive * 100) /
    (total + deliveryCharge)
  ).toFixed(2);

  return (
    <div style={infoStyle}>
      <div style={infoChildStyle}>
        <div style={innerStyle}>Total - </div>
        <div style={innerStyle}>{total} Rs</div>
      </div>
      <div style={infoChildStyle}>
        <div style={innerStyle}>Taxes and Delivery Charges ({dist}kms) - </div>
        <div style={innerStyle}>{deliveryCharge} Rs</div>
      </div>
      <div style={infoChildStyle}>
        <div style={innerStyle}>Net Amount - </div>
        <div style={innerStyle}>{total + deliveryCharge} Rs</div>
      </div>
      <div style={infoChildStyle}>
        <div style={innerStyle}>
          Discount Given by FoodApp ({discountRate}%) -{" "}
        </div>
        <div style={innerStyle}>{discountToGive} Rs</div>
      </div>
      <div style={infoChildStyle}>
        <div style={innerStyle}>
          <h3>Total to pay -</h3>
        </div>
        <div style={innerStyle}>
          <h3>{total + deliveryCharge - discountToGive} Rs</h3>
        </div>
      </div>
      <br />
      <div style={btnStyle}>Proceed</div>
    </div>
  );
}

export default Info;
