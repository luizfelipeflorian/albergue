/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  nicho
 * Created: 22 de set. de 2024
 */

INSERT INTO regra (id, nome, numero_de_diarias) VALUES
(1, '1 Pernoite', 1),
(2, '5 Pernoites', 5),
(3, '15 Pernoites', 15);

alter sequence regra_sequence restart with 4;