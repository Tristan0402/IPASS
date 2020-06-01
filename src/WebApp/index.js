let ShoppingCartContent = [];
function AddToCart(Broodjenummer){
    let AmountInCart = ShoppingCartContent.push(Broodjenummer);
    document.getElementById('AantalItems').innerHTML = AmountInCart;
}
function BackupInJSON(){
    ShoppingCartContent = [];
    document.getElementById('AantalItems').innerHTML = ShoppingCartContent.length
}
