function deleteProduct(endpoint, id){
    if(confirm("Ban chac chan muon xoa")=== true){
        fetch(`${endpoint}/${id}`, {
        method: "DELETE"
        }).then(res => {
            if(res.status== 204){
                alert("Xoa thanh cong");
                location.reload()
            }else {
                alert("He thong bi loi")
            }
        })
    }
}