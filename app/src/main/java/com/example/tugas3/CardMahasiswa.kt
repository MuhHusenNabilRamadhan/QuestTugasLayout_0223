package com.example.tugas3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardMahasiswa(
    nama: String,
    alamat: String,
    warnaCard: Color,
    noHp: String? = null,
    namaFontFamily: FontFamily = FontFamily.Default,
    namaFontWeight: FontWeight = FontWeight.Bold,
    namaFontSize: TextUnit = 22.sp
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 12.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = warnaCard)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_logo),
                modifier = Modifier.size(80.dp).padding(all = 5.dp)
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    nama,
                    fontSize = namaFontSize,
                    fontFamily = namaFontFamily,
                    fontWeight = namaFontWeight,
                    color = colorResource(id = R.color.white)
                )
                if (noHp != null) {
                    Text(
                        noHp,
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.cyan)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    alamat,
                    fontSize = 14.sp,
                    color = colorResource(id = R.color.yellow)
                )
            }

        }
    }
}