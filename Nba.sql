--ACTION--
insert into action values
(default,'Passe',0),
(default,'Tir 0',0),
(default,'Tir 1',1),
(default,'Tir 2',2),
(default,'Tir 3',3),
(default,'Intersection',0),
(default,'Rebond O',0),
(default,'Rebond D',0)
;

create view score as(
    select dm.det_match_match_id as match_id,sum(a.action_point) as score,e.equipe_nom as equipe_nom,m.match_date
    from detail_match dm
    join action a on dm.det_action_action_id = a.action_id
    join joueur j on dm.det_joueur_joueur_id = j.joueur_id
    join match m on dm.det_match_match_id = m.match_id
    join equipe e on e.equipe_id = j.joueur_equipe_equipe_id
    group by dm.det_match_match_id,j.joueur_equipe_equipe_id,m.match_id,e.equipe_nom
    order by m.match_date asc
);

