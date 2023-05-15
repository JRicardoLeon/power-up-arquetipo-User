
INSERT INTO `user` (
	`id`,
     `birth_date`,
     `dni_number`,
      `mail`,
     `name`,
     `password`,
     `phone`,
    `surname`,
    `id_role`
  )
VALUES
  (
    '1',
    '2000-05-07 12:15:42.737000',
    '1005085607',
    'prueba@gamil.com',
    'Ricardo',
    '$2a$10$GlsGSNhkbVon6ZOSNMptOu5RikedRzlCAhMa7YpwvUSS0c88WT99S',
    '3228530790',
    'Leon',
    '1'
  );


INSERT INTO `role` (`id`, `description`, `name`) VALUES ('1', 'ROLE_ADMIN', 'ROLE_ADMIN');
INSERT INTO `role` (`id`, `description`, `name`) VALUES ('2', 'ROLE_USER', 'ROLE_USER');