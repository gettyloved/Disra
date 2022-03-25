package com.ciru.disra

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ciru.disra.ui.theme.*


@Composable
fun Placement(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple700)
    ){
        Column {
            IconSearch()
            ItemIdentity()
            Total(total = "Total", dis = "Discount", vat ="V.A.T" , money = 0.00 , vatt = 0.00)
            MenuSales(newSale = "New Sale")
        }
    }
}

@Composable
fun IconSearch(){
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
          Icon(
              painter = painterResource(id = R.drawable.ic_baseline_bubble_chart_24),
              contentDescription = "icon",
              modifier = Modifier.size(24.dp)
          )
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_search_24),
                contentDescription = "search",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
                )
        }
}

@Composable
fun ItemIdentity(){
//    tutorial
}

@Composable
fun Total(
    total:String,
    dis:String,
    vat:String,
    money:Double,
    vatt:Double
){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = total,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        
        Column (
            verticalArrangement = Arrangement.SpaceAround
                ){
            Row(
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        text = dis,
                        fontSize = 12.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(5.dp)
//            should put discount persons choice i.e either percentage, amount etc
                    )
                    Text(
                        text = "money",
//                        text should take the money:int
                        fontSize = 10.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(5.dp)
                    )
                }

            Row(
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Text(
                    text = vat,
                    fontSize = 12.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
//            should put discount persons choice i.e either percentage, amount etc
                )
                Text(
                    text = "vatt",
//                        text should take the vatt:int
                    fontSize = 10.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
                )
            }

            Row(
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Text(
                    text = dis,
                    fontSize = 12.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
//            should take the total amount plus vat and discount
                )
            }
        }
    }
}

@Composable
fun MenuSales(
    newSale:String
){
    LazyRow(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
//       i need items to put the menu boxes/ buttons
        items(count = 5){
             Card(
                 modifier = Modifier
                     .size(60.dp)
                     .padding(5.dp)
                     .clip(RoundedCornerShape(5.dp))
                     .background(Purple500),
                 elevation = 4.dp
             ) {
                 Text(
                     text = newSale,
                     fontSize = 15.sp,
                     color = Teal200,
                     textAlign = TextAlign.Center,
                     modifier = Modifier.padding(5.dp)
                 )
             }
        }
    }
}







@Preview(showBackground = true)
@Composable
fun Preview() {
    DisraTheme {
        Placement()
    }
}