let ShoppingCartContent = [];
function AddToCart(Broodjenummer){
    let AmountInCart = ShoppingCartContent.push(Broodjenummer);
    document.getElementById('AantalItems').innerHTML = AmountInCart;
    alert(ShoppingCartContent);
}

function BackupInJSON(){
    sessionStorage.setItem("Cart", ShoppingCartContent);
    ShoppingCartContent = [];
    document.getElementById('AantalItems').innerHTML = ShoppingCartContent.length
}